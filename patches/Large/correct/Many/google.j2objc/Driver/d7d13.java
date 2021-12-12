diff --git a/jre_emul/android/platform/libcore/xml/src/main/java/org/xmlpull/v1/sax2/Driver.java b/jre_emul/android/platform/libcore/xml/src/main/java/org/xmlpull/v1/sax2/Driver.java
index 7b5b440..5e38d58 100644
--- a/jre_emul/android/platform/libcore/xml/src/main/java/org/xmlpull/v1/sax2/Driver.java
+++ b/jre_emul/android/platform/libcore/xml/src/main/java/org/xmlpull/v1/sax2/Driver.java
@@ -421,7 +421,8 @@
                             }
                             contentHandler.endElement(pp.getNamespace(),
                                                       name,
-                                                      prefix != null ? name : rawName.toString()
+                                                      // TODO Fixed this. Was "not equals".
+                                                      prefix == null ? name : rawName.toString()
                                                      );
                             // when entering show prefixes for all levels!!!!
                             final int depth = pp.getDepth();
