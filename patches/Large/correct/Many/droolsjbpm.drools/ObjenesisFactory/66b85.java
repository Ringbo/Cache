diff --git a/drools-core/src/main/java/org/drools/util/ObjenesisFactory.java b/drools-core/src/main/java/org/drools/util/ObjenesisFactory.java
index f406445..eca2276 100644
--- a/drools-core/src/main/java/org/drools/util/ObjenesisFactory.java
+++ b/drools-core/src/main/java/org/drools/util/ObjenesisFactory.java
@@ -30,7 +30,7 @@
 public class ObjenesisFactory implements Serializable {
     
     private static final long serialVersionUID = 969174504278340793L;
-    private static final Objenesis OBJENESIS_INSTANCE = null;
+    private static Objenesis OBJENESIS_INSTANCE = null;
 
     private ObjenesisFactory() {}
     
@@ -39,7 +39,7 @@
      */
     public static Objenesis getStaticObjenesis() {
         if( OBJENESIS_INSTANCE == null ) {
-            new ObjenesisStd(true);
+            OBJENESIS_INSTANCE = new ObjenesisStd(true);
         }
         return OBJENESIS_INSTANCE;
     }
