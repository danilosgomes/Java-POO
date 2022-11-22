public class Robo {
  String palavra;

  public Robo(String palavra) {
      this.palavra = palavra;
  }

  public Collection<String> palavrasValidas(){
      return geraPalavras(palavra);
  }
  
  public int palavraCompleta(String palavra){
      for (int i = 0; i < palavra.length(); i++){
          if (palavra.charAt(i) == '?'){
              return i;
          }
      }
      return -1;
  }
  
  public ArrayList<String> geraPalavras(String palavra){
      int ret = palavraCompleta(palavra);
      ArrayList<String> palavras = new ArrayList<>();
      if (ret == -1) {
          palavras.add(palavra);
          return palavras;
      }else{
          if ((ret == 0 || (ret > 0  && palavra.charAt(ret - 1) != 'a')) && ((ret == palavra.length() - 1 ||  palavra .charAt(ret +1) != 'a'))) {
                  char[] chars = palavra.toCharArray();
                  chars[ret]= 'a';
                  String p = String. valueOf(chars);
                  palavras.addAll(geraPalavras(p));
              }
                  char[] chars = palavra.toCharArray();
                  chars[ret] = 'b';
                  String p = String. valueOf(chars);
                  palavras.addAll(geraPalavras(p));
                  return palavras;
          }
          
  }

}
public class Solver {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      Robo r = new Robo(s);
      for (String palavra : r.palavrasValidas()) {
          System.out.println(palavra);
      }

  }   
}