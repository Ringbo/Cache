diff --git a/Essentials/src/com/earth2me/essentials/I18n.java b/Essentials/src/com/earth2me/essentials/I18n.java
index 33708e5..63fdcc0 100644
--- a/Essentials/src/com/earth2me/essentials/I18n.java
+++ b/Essentials/src/com/earth2me/essentials/I18n.java
@@ -28,7 +28,7 @@
 	public I18n(final IEssentials ess)
 	{
 		this.ess = ess;
-		customBundle = ResourceBundle.getBundle(MESSAGES, defaultLocale);
+		customBundle = ResourceBundle.getBundle(MESSAGES, defaultLocale, new FileResClassLoader(I18n.class.getClassLoader(), ess));
 		localeBundle = ResourceBundle.getBundle(MESSAGES, defaultLocale);
 		defaultBundle = ResourceBundle.getBundle(MESSAGES, Locale.ENGLISH);
 	}
