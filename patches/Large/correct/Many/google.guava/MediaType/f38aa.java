diff --git a/guava/src/com/google/common/net/MediaType.java b/guava/src/com/google/common/net/MediaType.java
index 0a2957d..754482b 100644
--- a/guava/src/com/google/common/net/MediaType.java
+++ b/guava/src/com/google/common/net/MediaType.java
@@ -615,7 +615,7 @@
       }
       return create(type, subtype, parameters.build());
     } catch (IllegalStateException e) {
-      throw new IllegalArgumentException(e);
+      throw new IllegalArgumentException("Could not parse '" + input + "'", e);
     }
   }
 
