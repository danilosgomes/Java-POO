public class Transaction {
  private String codename;
  private int id;
  private int value;

  public Transaction(int id, String codename, int value) {
      this.codename = codename;
      this.value = value;
      this.id = id;
  }

  public String getCodename() {
      return codename;
  }

  public void setCodename(String codename) {
      this.codename = codename;
  }

  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public int getValue() {
      return value;
  }

  public void setValue(int value) {
      this.value = value;
  }

  @Override
  public String toString() {
      return String.format("- id:%d %s:%d", getId(), getCodename(), getValue());
  }
}
