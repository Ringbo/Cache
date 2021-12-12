diff --git a/library/actor-common/src/main/java/im/actor/model/entity/ContentDescription.java b/library/actor-common/src/main/java/im/actor/model/entity/ContentDescription.java
index b26193a..574acd8 100644
--- a/library/actor-common/src/main/java/im/actor/model/entity/ContentDescription.java
+++ b/library/actor-common/src/main/java/im/actor/model/entity/ContentDescription.java
@@ -65,7 +65,7 @@
                     0, true);
         } else if (msg instanceof ServiceGroupUserJoined) {
             return new ContentDescription(ContentType.SERVICE_JOINED, "",
-                    0, true);
+                    0, false);
         } else {
             return new ContentDescription(ContentType.UNKNOWN_CONTENT);
         }
