diff --git a/src/org/qii/weiciyuan/bean/MessageBean.java b/src/org/qii/weiciyuan/bean/MessageBean.java
index e541d2f..0ab2ae3 100644
--- a/src/org/qii/weiciyuan/bean/MessageBean.java
+++ b/src/org/qii/weiciyuan/bean/MessageBean.java
@@ -289,7 +289,7 @@
             return sourceString;
         } else {
             if (!TextUtils.isEmpty(source))
-                source = Html.fromHtml(this.source).toString();
+                sourceString = Html.fromHtml(this.source).toString();
             return sourceString;
         }
     }
