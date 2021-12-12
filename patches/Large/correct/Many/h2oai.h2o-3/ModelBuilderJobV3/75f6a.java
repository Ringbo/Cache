diff --git a/h2o-core/src/main/java/water/api/ModelBuilderJobV3.java b/h2o-core/src/main/java/water/api/ModelBuilderJobV3.java
index 59b2dcf..340c7a3 100644
--- a/h2o-core/src/main/java/water/api/ModelBuilderJobV3.java
+++ b/h2o-core/src/main/java/water/api/ModelBuilderJobV3.java
@@ -21,7 +21,7 @@
   public int error_count;
 
   @Override
-  public ModelBuilderJobV3 fillFromImpl(ModelBuilder builder) {
+  public S fillFromImpl(ModelBuilder builder) {
     super.fillFromImpl((Job)builder);
 
     this.messages = new ValidationMessageBase[builder._messages.length];
@@ -35,6 +35,6 @@
 
     ModelBuilderSchema s = (ModelBuilderSchema)Schema.schema(this.getSchemaVersion(), builder).fillFromImpl(builder);
     parameters = s.parameters;
-    return this;
+    return (S) this;
   }
 }
