diff --git a/h2o-core/src/main/java/water/Weaver.java b/h2o-core/src/main/java/water/Weaver.java
index e440b84..2343b7f 100644
--- a/h2o-core/src/main/java/water/Weaver.java
+++ b/h2o-core/src/main/java/water/Weaver.java
@@ -77,7 +77,7 @@
     CtClass icer_cc = _pool.getOrNull(icer_name); // Full Name Lookup of Icer
     if( icer_cc != null ) {
       synchronized( iced_clazz ) {
-        if( !icer_cc.isFrozen() ) icer_cc.toClass(); // Load class (but does not link & init)
+        if( !icer_cc.isFrozen() ) icer_cc.toClass(Weaver.class.getClassLoader()); // Load class (but does not link & init)
         return Class.forName(icer_name); // Found a pre-cooked Icer implementation
       }
     }
@@ -99,7 +99,7 @@
       icer_cc = _pool.getOrNull(icer_name); // Retry under lock
       if( icer_cc != null ) return Class.forName(icer_name); // Found a pre-cooked Icer implementation
       icer_cc = genIcerClass(id,iced_cc,iced_clazz,icer_name,super_id,super_icer_cc,super_has_jfields);
-      icer_cc.toClass();               // Load class (but does not link & init)
+      icer_cc.toClass(Weaver.class.getClassLoader());               // Load class (but does not link & init)
       return Class.forName(icer_name); // Initialize class now, before subclasses
     }
   }
