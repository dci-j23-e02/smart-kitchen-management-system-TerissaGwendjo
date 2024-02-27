package src;

public enum SqlQuery {
    //here you are saving the sql queries cuz they are all final and static

    GET_APPLIANCES_BY_ID ("SELECT * FROM appliances WHERE id = ?"), //This function is likely designed to retrieve an ingredient from a database based on its unique identifier (id)
    GET_ALL_APPLIANCES("SELECT * FROM appliances"),
    INSERT_APPLIANCE("INSERT INTO appliances (name, quantity) VALUES (?,?)"),
    UPDATE_APPLIANCE("UPDATE appliances SET name = ?, quantity = ? WHERE ID = ?"),
    DELETE_APPLIANCE("DELETE FROM appliances WHERE id = ?"),
    GET_APPLIANCE_BY_NAME("SELECT * FROM appliances WHERE name = ?");

    private final String query;

    SqlQuery(String query) {
        this.query = query;
    }
    public String getQuery() {
        return query;
    }
}
