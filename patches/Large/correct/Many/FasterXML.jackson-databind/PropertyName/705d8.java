diff --git a/src/main/java/com/fasterxml/jackson/databind/PropertyName.java b/src/main/java/com/fasterxml/jackson/databind/PropertyName.java
index 5e12afa..ffeec68 100644
--- a/src/main/java/com/fasterxml/jackson/databind/PropertyName.java
+++ b/src/main/java/com/fasterxml/jackson/databind/PropertyName.java
@@ -122,7 +122,7 @@
         if (USE_DEFAULT == o) {
             return this == USE_DEFAULT;
         }
-        PropertyName other = (PropertyName) this;
+        PropertyName other = (PropertyName) o;
         if (_simpleName == null) {
             if (other._simpleName != null) return false;
         } else if (!_simpleName.equals(other._simpleName)) {
