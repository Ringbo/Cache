diff --git a/java/org/apache/catalina/ha/session/DeltaSession.java b/java/org/apache/catalina/ha/session/DeltaSession.java
index 07864ca..dfa726e 100644
--- a/java/org/apache/catalina/ha/session/DeltaSession.java
+++ b/java/org/apache/catalina/ha/session/DeltaSession.java
@@ -731,7 +731,7 @@
         for (int i = 0; i < keys.length; i++) {
             Object value = null;
             value = attributes.get(keys[i]);
-            if (value == null)
+            if (value == null || exclude(keys[i]))
                 continue;
             else if (value instanceof Serializable) {
                 saveNames.add(keys[i]);
