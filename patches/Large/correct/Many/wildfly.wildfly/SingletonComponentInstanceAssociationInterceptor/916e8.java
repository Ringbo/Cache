diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/component/singleton/SingletonComponentInstanceAssociationInterceptor.java b/ejb3/src/main/java/org/jboss/as/ejb3/component/singleton/SingletonComponentInstanceAssociationInterceptor.java
index ae9c45b..c02be52 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/component/singleton/SingletonComponentInstanceAssociationInterceptor.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/component/singleton/SingletonComponentInstanceAssociationInterceptor.java
@@ -44,9 +44,8 @@
     @Override
     public Object processInvocation(InterceptorContext interceptorContext) throws Exception {
         SingletonComponent singletonComponent = getComponent(interceptorContext, SingletonComponent.class);
-        // get the component instance
         ComponentInstance singletonComponentInstance = singletonComponent.getComponentInstance();
-        if (singletonComponent == null) {
+        if (singletonComponentInstance == null) {
             throw MESSAGES.componentInstanceNotAvailable(interceptorContext);
         }
         interceptorContext.putPrivateData(ComponentInstance.class, singletonComponentInstance);
