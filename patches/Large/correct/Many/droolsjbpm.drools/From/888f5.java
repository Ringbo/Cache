diff --git a/drools-core/src/main/java/org/drools/rule/From.java b/drools-core/src/main/java/org/drools/rule/From.java
index 05366f0..4489d42 100644
--- a/drools-core/src/main/java/org/drools/rule/From.java
+++ b/drools-core/src/main/java/org/drools/rule/From.java
@@ -37,7 +37,7 @@
     }
     
     public void wire(Object object) {
-        this.dataProvider = ( DataProvider ) dataProvider;
+        this.dataProvider = ( DataProvider ) object;
     }    
 
     public DataProvider getDataProvider() {
