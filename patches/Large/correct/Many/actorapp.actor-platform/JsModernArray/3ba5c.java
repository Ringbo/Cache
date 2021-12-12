diff --git a/actor-sdk/sdk-core/runtime/runtime-js/src/main/java/im/actor/runtime/js/utils/JsModernArray.java b/actor-sdk/sdk-core/runtime/runtime-js/src/main/java/im/actor/runtime/js/utils/JsModernArray.java
index 8ec3cdd..7a88cbb 100644
--- a/actor-sdk/sdk-core/runtime/runtime-js/src/main/java/im/actor/runtime/js/utils/JsModernArray.java
+++ b/actor-sdk/sdk-core/runtime/runtime-js/src/main/java/im/actor/runtime/js/utils/JsModernArray.java
@@ -5,18 +5,18 @@
 
 public class JsModernArray<T extends JavaScriptObject> extends JsArray<T> {
 
-    public native void clear()/*-{ this.splice(0, this.length); }-*/;
+    public final native void clear()/*-{ this.splice(0, this.length); }-*/;
 
-    public native void insert(int index, T obj)/*-{ this.splice(index, 0, obj); }-*/;
+    public final native void insert(int index, T obj)/*-{ this.splice(index, 0, obj); }-*/;
 
-    public native void remove(int index)/*-{ this.splice(index, 1); }-*/;
+    public final native void remove(int index)/*-{ this.splice(index, 1); }-*/;
 
-    public void update(int index, T obj) {
+    public final void update(int index, T obj) {
         remove(index);
         insert(index, obj);
     }
 
-    public native JsArray<T> reverse()/*-{ return this.slice().reverse(); }-*/;
+    public final native JsArray<T> reverse()/*-{ return this.slice().reverse(); }-*/;
 
     protected JsModernArray() {
 
