diff --git a/jodd-proxetta/src/test/java/jodd/JoddProxettaTest.java b/jodd-proxetta/src/test/java/jodd/JoddProxettaTest.java
index 7a69dfa..10a794b 100644
--- a/jodd-proxetta/src/test/java/jodd/JoddProxettaTest.java
+++ b/jodd-proxetta/src/test/java/jodd/JoddProxettaTest.java
@@ -39,7 +39,7 @@
 		assertFalse(Jodd.isModuleLoaded(HTTP));
 		assertFalse(Jodd.isModuleLoaded(MADVOC));
 		assertFalse(Jodd.isModuleLoaded(MAIL));
-		assertFalse(Jodd.isModuleLoaded(PETITE));
+		assertTrue(Jodd.isModuleLoaded(PETITE));
 		assertFalse(Jodd.isModuleLoaded(PROPS));
 		assertTrue(Jodd.isModuleLoaded(PROXETTA));
 		assertFalse(Jodd.isModuleLoaded(SERVLET));
