class DD{
  public static void main(String[] args) {
    String sh="Hi.this.is.a.experiment";
    //System.out.println(sh);

    String[] f=sh.split("\\x2E");
    System.out.println(f[1]);
    for (int i=0; i<f.length;i++ ) {
      System.out.println(f[i]);
    }
  }
}
