package api;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
public class App {
    public static final  String  ACCOUNT_SID="ACac7d4e33e0945743922548b1a7a4ab8d";
    public static final  String AUTH_TOKEN = "08367651b25be5cbe97ce0edd7a67964";
    public static final  String Destino_Number = "+593995468359";
    public static final  String Twilio_Number = "+14155238886";
    public static void main( String[] args )
    {
      String mensajeEnviar = "hola";
      int habitacionSeleccionada = 1;
      if (habitacionSeleccionada == 1) {
        mensajeEnviar="Cuarto 1:" +"\n"+"1.Dos habitaciones";
      }
      Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
      Message message = Message.creator(
      new com.twilio.type.PhoneNumber("whatsapp:"+Destino_Number),
      new com.twilio.type.PhoneNumber("whatsapp:"+Twilio_Number),
    mensajeEnviar).create();

    System.out.println(message.getSid());
}
}