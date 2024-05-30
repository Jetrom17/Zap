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

![https://apps.obtainium.imranr.dev/redirect?r=obtainium://app/%7B%22id%22%3A%22my.zap%22%2C%22url%22%3A%22https%3A%2F%2Fgithub.com%2FJetrom17%2FZap%22%2C%22author%22%3A%22Jetrom17%22%2C%22name%22%3A%22ZapZam%22%2C%22preferredApkIndex%22%3A0%2C%22additionalSettings%22%3A%22%7B%5C%22includePrereleases%5C%22%3Afalse%2C%5C%22fallbackToOlderReleases%5C%22%3Atrue%2C%5C%22filterReleaseTitlesByRegEx%5C%22%3A%5C%22%5C%22%2C%5C%22filterReleaseNotesByRegEx%5C%22%3A%5C%22%5C%22%2C%5C%22verifyLatestTag%5C%22%3Atrue%2C%5C%22dontSortReleasesList%5C%22%3Afalse%2C%5C%22useLatestAssetDateAsReleaseDate%5C%22%3Afalse%2C%5C%22trackOnly%5C%22%3Afalse%2C%5C%22versionExtractionRegEx%5C%22%3A%5C%22%5C%22%2C%5C%22matchGroupToUse%5C%22%3A%5C%22%5C%22%2C%5C%22versionDetection%5C%22%3Afalse%2C%5C%22releaseDateAsVersion%5C%22%3Afalse%2C%5C%22useVersionCodeAsOSVersion%5C%22%3Afalse%2C%5C%22apkFilterRegEx%5C%22%3A%5C%22%5C%22%2C%5C%22invertAPKFilter%5C%22%3Afalse%2C%5C%22autoApkFilterByArch%5C%22%3Atrue%2C%5C%22appName%5C%22%3A%5C%22%5C%22%2C%5C%22shizukuPretendToBeGooglePlay%5C%22%3Afalse%2C%5C%22exemptFromBackgroundUpdates%5C%22%3Afalse%2C%5C%22skipUpdateNotifications%5C%22%3Afalse%2C%5C%22about%5C%22%3A%5C%22%5C%22%7D%22%2C%22overrideSource%22%3A%22GitHub%22%7D](https://github.com/Jetrom17/Zap/blob/main/badge_obtainium.png?raw=true)
