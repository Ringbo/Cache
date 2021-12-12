diff --git a/drools-core/src/main/java/org/drools/core/command/runtime/SetGlobalCommand.java b/drools-core/src/main/java/org/drools/core/command/runtime/SetGlobalCommand.java
index dcfe109..0bf5b80 100644
--- a/drools-core/src/main/java/org/drools/core/command/runtime/SetGlobalCommand.java
+++ b/drools-core/src/main/java/org/drools/core/command/runtime/SetGlobalCommand.java
@@ -35,7 +35,7 @@
 @XmlAccessorType(XmlAccessType.NONE)
 public class SetGlobalCommand
     implements
-    GenericCommand<Void> , IdentifiableResult{
+    GenericCommand<Object> , IdentifiableResult{
 
     @XmlAttribute(required=true)
     private String  identifier;
@@ -56,7 +56,7 @@
         this.object = object;
     }
 
-    public Void execute(Context context) {
+    public Object execute(Context context) {
         KieSession ksession = ((KnowledgeCommandContext) context).getKieSession();
 
         if ( this.outIdentifier != null ) {
@@ -66,7 +66,9 @@
 
         ksession.setGlobal( this.identifier,
                             this.object );
-        return null;
+
+        // returning the object is necessary for drools-simulator
+        return this.object;
     }
 
     public String getIdentifier() {
