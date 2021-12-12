diff --git a/core/cas-server-core-util/src/main/java/org/apereo/cas/util/serialization/StringSerializer.java b/core/cas-server-core-util/src/main/java/org/apereo/cas/util/serialization/StringSerializer.java
index db0a2d6..af843c0 100644
--- a/core/cas-server-core-util/src/main/java/org/apereo/cas/util/serialization/StringSerializer.java
+++ b/core/cas-server-core-util/src/main/java/org/apereo/cas/util/serialization/StringSerializer.java
@@ -94,7 +94,7 @@
         if (result != null) {
             return CollectionUtils.wrapList(result);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     /**
