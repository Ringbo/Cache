diff --git a/actor-apps/core-js/src/main/java/im/actor/model/js/JsFacade.java b/actor-apps/core-js/src/main/java/im/actor/model/js/JsFacade.java
index ed63dc9..4698312 100644
--- a/actor-apps/core-js/src/main/java/im/actor/model/js/JsFacade.java
+++ b/actor-apps/core-js/src/main/java/im/actor/model/js/JsFacade.java
@@ -710,7 +710,7 @@
                             jsUsers.push(messenger.getJsUser(user.getId()).get());
                         }
 
-                        resolve(users);
+                        resolve(jsUsers);
                     }
 
                     @Override
