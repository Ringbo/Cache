diff --git a/src/com/google/javascript/jscomp/Es6ConvertSuperConstructorCalls.java b/src/com/google/javascript/jscomp/Es6ConvertSuperConstructorCalls.java
index d8aeacd..f881a25 100644
--- a/src/com/google/javascript/jscomp/Es6ConvertSuperConstructorCalls.java
+++ b/src/com/google/javascript/jscomp/Es6ConvertSuperConstructorCalls.java
@@ -319,10 +319,8 @@
             IR.assign(
                 IR.getprop(IR.thisNode(), IR.string("stack")),
                 IR.getprop(IR.name(TMP_ERROR), IR.string("stack"))));
-    // TODO(bradfordcsmith): The spec says super() should return `this`, but Angular2 errors.ts
-    //     currently depends on it returning the newly created Error object.
     Node superErrorExpr =
-        IR.comma(IR.comma(IR.comma(getTmpError, copyMessage), setStack), IR.name(TMP_ERROR))
+        IR.comma(IR.comma(IR.comma(getTmpError, copyMessage), setStack), IR.thisNode())
             .useSourceInfoIfMissingFromForTree(superCall);
     superCall.replaceWith(superErrorExpr);
   }
