package src;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class ApplianceDaoImpl implements ApplianceDao {


    @Override
    public Appliance getAppliance(int applianceId) {

        try (
                Connection connection = ConnectionFactory.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery.GET_APPLIANCES_BY_ID.getQuery())
        ) {
            preparedStatement.setInt(1, applianceId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return extractApplianceFromResultSet(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Appliance extractApplianceFromResultSet(ResultSet resultSet) throws SQLException {
        Appliance appliance = new Appliance();
        appliance.setId(resultSet.getInt("id"));
        appliance.setName(resultSet.getString("name"));
        appliance.setType(resultSet.getString("type"));
        appliance.setStatus(resultSet.getString("status"));
        appliance.setUsage_time(resultSet.getInt("usage_time"));
        return appliance;
    }

        @Override
        public Set<Appliance> getAllAppliances () {
            Set<Appliance> appliances = new HashSet<>();

            try (Connection connection = ConnectionFactory.getConnection();
                 Statement statement = connection.createStatement();
                 ResultSet resultSet1 = statement.executeQuery(SqlQuery.GET_ALL_APPLIANCES.getQuery())) {
                while (resultSet1.next()) {
                    appliances.add(extractApplianceFromResultSet(resultSet1));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            return appliances;
        }
        public Appliance insertAppliance (Appliance appliance){

            try(
                    Connection connection = ConnectionFactory.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery.INSERT_APPLIANCE.getQuery());
            ){
                preparedStatement.setString(1, appliance.getName());
                preparedStatement.setString(2, appliance.getType());
              /*  preparedStatement.setString(3, appliance.getStatus());
                preparedStatement.setInt(4,appliance.getUsageTime());*/
                int affectedrows = preparedStatement.executeUpdate();
                if(affectedrows >0){
                    return getApplianceByName(appliance.getName());
                }
            }catch(SQLException e){
                e.printStackTrace();
            }

            return null;
        }

    private Appliance getApplianceByName(String applianceName) {

        try(
                Connection connection = ConnectionFactory.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery.GET_APPLIANCE_BY_NAME.getQuery())
        ){
            preparedStatement.setString(1, applianceName);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return extractApplianceFromResultSet(resultSet);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    //@Override
        public boolean updateAppliance (Appliance appliance){
        try(
                Connection connection = ConnectionFactory.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery.UPDATE_APPLIANCE.getQuery());
        ){

            preparedStatement.setString(1, appliance.getName());
            preparedStatement.setString(2, appliance.getType());
            preparedStatement.setString(3, appliance.getStatus());
            preparedStatement.setInt(4,appliance.getUsage_time());
            preparedStatement.setInt(5,appliance.getId());

            int affectedRows = preparedStatement.executeUpdate();
            if(affectedRows > 0){
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
        }

        //@Override
        public boolean deleteAppliance ( int applianceId){

            try(
                    Connection connection = ConnectionFactory.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery.DELETE_APPLIANCE.getQuery());
            ){

                preparedStatement.setInt(1, applianceId);

                int affectedRows = preparedStatement.executeUpdate();
                return affectedRows > 0;
            } catch(SQLException e){
                e.printStackTrace();
            }
            return false;
        }
}

