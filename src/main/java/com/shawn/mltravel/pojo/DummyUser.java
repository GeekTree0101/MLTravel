package com.shawn.mltravel.pojo;

public class DummyUser {

  private int id;
  private String username;
  private String password;
  private String state;

  public DummyUser(int id, String username, String password, String state) {
      this.id = id;
      this.username = username;
      this.password = password;
      this.state = state;
  }
  
  public int getId() {
    return this.id;
  }

  public String getUsername() {
    return this.username;
  }

  public String getPassword() {
    return this.password;
  }

  public String getState() {
    return this.state;
  }

  
}
