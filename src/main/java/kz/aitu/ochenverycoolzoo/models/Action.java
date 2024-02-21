package kz.aitu.ochenverycoolzoo.models;

public class Action {
    private static int id = 0;
    private String request;
    private String response;

    public Action(String request, String response) {
        id++;
        this.request = request;
        this.response = response;
    }

    public Action(int id, String request, String response) {
        Action.id = id;
        this.request = request;
        this.response = response;
    }


    public void setRequest(String request) {
        this.request = request;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public static int getId() {
        return id;
    }

    public String getRequest() {
        return request;
    }

    public String getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return request;
    }
}
