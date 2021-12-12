diff --git a/src/main/groovy/lang/MetaClassImpl.java b/src/main/groovy/lang/MetaClassImpl.java
index 2a998d9..e114a88 100644
--- a/src/main/groovy/lang/MetaClassImpl.java
+++ b/src/main/groovy/lang/MetaClassImpl.java
@@ -854,13 +854,13 @@
 
 
    public Constructor retrieveConstructor(Class[] arguments) {
-       Constructor constructor = (Constructor) chooseMethod("<init>", constructors, arguments, false);
+       CachedConstructor constructor = (CachedConstructor) chooseMethod("<init>", constructors, arguments, false);
        if (constructor != null) {
-           return constructor;
+           return constructor.cachedConstructor;
        }
-       constructor = (Constructor) chooseMethod("<init>", constructors, arguments, true);
+       constructor = (CachedConstructor) chooseMethod("<init>", constructors, arguments, true);
        if (constructor != null) {
-           return constructor;
+           return constructor.cachedConstructor;
        }
        return null;
    }
