# Zap
Aplicativo clique rápido Whatsapp

<img src="demo.png" width="200" height="400">

Simplesmente elimina o uso da api `wa.me/+55XXXX` do WhatsApp. O aplicativo facilita na hora de conversar com alguém sem adicionar o número de telefone em seus contatos.

Possibilidades que são aceitas:

```java
// Remover todos os caracteres não numéricos
phoneNumber = phoneNumber.replaceAll("[^0-9]", "");

// Verificar o comprimento do número de telefone e ajustar conforme necessário
switch (phoneNumber.length()) {
    case 8: // Apenas o número, sem DDD nem código do país
        phoneNumber = "5591" + phoneNumber;
        break;
    case 9: // Número com DDD, sem código do país
        phoneNumber = "55" + phoneNumber;
        break;
    case 10: // Número com DDD, sem código do país
        phoneNumber = "55" + phoneNumber;
        break;
    case 11: // Número com DDD, sem código do país
        phoneNumber = "55" + phoneNumber;
        break;
    case 12: // Número com DDD e código do país (começa com "55")
        break;
    default: // Comprimento inválido
        // Tratar como número inválido
        // Você pode exibir uma mensagem de erro aqui
        break;
}

// Construir o link do WhatsApp
String whatsappLink = "https://wa.me/" + phoneNumber;

// Abrir o WhatsApp
Intent intent = new Intent(Intent.ACTION_VIEW);
intent.setData(Uri.parse(whatsappLink));
startActivity(intent);
```
