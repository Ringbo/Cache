diff --git a/java/org/apache/catalina/session/StandardSession.java b/java/org/apache/catalina/session/StandardSession.java
index 1de9060..9e1c61e 100644
--- a/java/org/apache/catalina/session/StandardSession.java
+++ b/java/org/apache/catalina/session/StandardSession.java
@@ -1391,8 +1391,8 @@
 
         // Validate our current state
         if (!isValidInternal())
-            throw new IllegalStateException
-                (sm.getString("standardSession.setAttribute.ise"));
+            throw new IllegalStateException(sm.getString(
+                    "standardSession.setAttribute.ise", getIdInternal()));
         if ((manager != null) && manager.getDistributable() &&
           !(value instanceof Serializable))
             throw new IllegalArgumentException
