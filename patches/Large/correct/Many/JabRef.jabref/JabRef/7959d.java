diff --git a/src/main/java/net/sf/jabref/JabRef.java b/src/main/java/net/sf/jabref/JabRef.java
index fa7e22e..bd7216c 100644
--- a/src/main/java/net/sf/jabref/JabRef.java
+++ b/src/main/java/net/sf/jabref/JabRef.java
@@ -634,7 +634,7 @@
             else {
             	try {
             		UIManager.setLookAndFeel(lookFeel);
-            	} catch(ClassNotFoundException e) {
+            	} catch (Exception e) { // javax.swing.UnsupportedLookAndFeelException (sure; see bug #1278) or ClassNotFoundException (unsure) may be thrown
             		// specified look and feel does not exist on the classpath, so use system l&f
             		UIManager.setLookAndFeel(systemLnF);
             		// also set system l&f as default
