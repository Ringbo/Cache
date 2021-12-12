diff --git a/plugin/core/src/main/java/org/elasticsearch/xpack/core/security/action/token/InvalidateTokenRequest.java b/plugin/core/src/main/java/org/elasticsearch/xpack/core/security/action/token/InvalidateTokenRequest.java
index 8ad4f02..7a8372f 100644
--- a/plugin/core/src/main/java/org/elasticsearch/xpack/core/security/action/token/InvalidateTokenRequest.java
+++ b/plugin/core/src/main/java/org/elasticsearch/xpack/core/security/action/token/InvalidateTokenRequest.java
@@ -74,7 +74,7 @@
         if (out.getVersion().onOrAfter(Version.V_6_2_0)) {
             out.writeVInt(tokenType.ordinal());
         } else if (tokenType == Type.REFRESH_TOKEN) {
-            throw new UnsupportedOperationException("refresh token invalidation cannot be serialized with version [" + out.getVersion() +
+            throw new IllegalArgumentException("refresh token invalidation cannot be serialized with version [" + out.getVersion() +
                     "]");
         }
     }
