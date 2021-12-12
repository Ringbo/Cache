diff --git a/activemq-core/src/main/java/org/apache/activemq/kaha/impl/ContainerValueCollection.java b/activemq-core/src/main/java/org/apache/activemq/kaha/impl/ContainerValueCollection.java
index 09f7944..cf19479 100644
--- a/activemq-core/src/main/java/org/apache/activemq/kaha/impl/ContainerValueCollection.java
+++ b/activemq-core/src/main/java/org/apache/activemq/kaha/impl/ContainerValueCollection.java
@@ -66,7 +66,7 @@
     public Object[] toArray(Object[] result){
         List list=container.getItemList();
         synchronized(list){
-            if(result.length<list.size()){
+            if(result.length<=list.size()){
                 int count=0;
                 result=(Object[]) java.lang.reflect.Array.newInstance(result.getClass().getComponentType(),list.size());
                 for(Iterator i=list.iterator();i.hasNext();){
