diff --git a/core/java/android/widget/Adapters.java b/core/java/android/widget/Adapters.java
index 7fd7fb5..80d8ec1 100644
--- a/core/java/android/widget/Adapters.java
+++ b/core/java/android/widget/Adapters.java
@@ -545,7 +545,8 @@
             String name = parser.getName();
             if (assertName != null && !assertName.equals(name)) {
                 throw new IllegalArgumentException("The adapter defined in " +
-                        c.getResources().getResourceEntryName(id) + " must be a <" + name + " />");
+                        c.getResources().getResourceEntryName(id) + " must be a <" +
+                        assertName + " />");
             }
 
             if (ADAPTER_CURSOR.equals(name)) {
