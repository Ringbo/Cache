diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/blocks/GrClosableBlockImpl.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/blocks/GrClosableBlockImpl.java
index d7d68f4..b01ce94 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/blocks/GrClosableBlockImpl.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/blocks/GrClosableBlockImpl.java
@@ -123,7 +123,7 @@
         if (!ResolveUtil.processElement(processor, synth[0], state)) return false;
       }
     }
-    return false;
+    return true;
   }
 
   private boolean processOwner(PsiScopeProcessor processor, ResolveState state) {
