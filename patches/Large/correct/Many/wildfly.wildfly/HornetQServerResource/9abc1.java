diff --git a/messaging/src/main/java/org/jboss/as/messaging/HornetQServerResource.java b/messaging/src/main/java/org/jboss/as/messaging/HornetQServerResource.java
index 857f347..ae00f7f 100644
--- a/messaging/src/main/java/org/jboss/as/messaging/HornetQServerResource.java
+++ b/messaging/src/main/java/org/jboss/as/messaging/HornetQServerResource.java
@@ -109,7 +109,7 @@
             }
             throw new NoSuchElementException(element.toString());
         } else {
-            return delegate.getChild(element);
+            return delegate.requireChild(element);
         }
     }
 
