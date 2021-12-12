diff --git a/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/utils/Util.java b/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/utils/Util.java
index 5fb1639..4407c08 100644
--- a/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/utils/Util.java
+++ b/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/utils/Util.java
@@ -224,7 +224,7 @@
 
             // lets see if there are any matching podList left
             List<Pod> filteredPods = client.pods().inNamespace(sessionNamespace).list().getItems();
-            if (filteredPods.isEmpty()) {
+            if (filteredPods == null || filteredPods.isEmpty()) {
                 return;
             } else {
                 try {
