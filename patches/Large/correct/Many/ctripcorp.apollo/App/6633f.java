diff --git a/apollo-common/src/main/java/com/ctrip/framework/apollo/common/entity/App.java b/apollo-common/src/main/java/com/ctrip/framework/apollo/common/entity/App.java
index b27ccf2..ac108ba 100644
--- a/apollo-common/src/main/java/com/ctrip/framework/apollo/common/entity/App.java
+++ b/apollo-common/src/main/java/com/ctrip/framework/apollo/common/entity/App.java
@@ -115,7 +115,7 @@
     }
 
     public Builder ownerName(String ownerName) {
-      app.setOrgName(ownerName);
+      app.setOwnerName(ownerName);
       return this;
     }
 
