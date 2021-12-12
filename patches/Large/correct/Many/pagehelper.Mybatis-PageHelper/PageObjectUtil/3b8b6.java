diff --git a/src/main/java/com/github/pagehelper/util/PageObjectUtil.java b/src/main/java/com/github/pagehelper/util/PageObjectUtil.java
index 5f0098d..2425a85 100644
--- a/src/main/java/com/github/pagehelper/util/PageObjectUtil.java
+++ b/src/main/java/com/github/pagehelper/util/PageObjectUtil.java
@@ -105,7 +105,7 @@
             pageNum = Integer.parseInt(String.valueOf(_pageNum));
             pageSize = Integer.parseInt(String.valueOf(_pageSize));
         } catch (NumberFormatException e) {
-            throw new PageException("分页参数不是合法的数字类型!");
+            throw new PageException("分页参数不是合法的数字类型!", e);
         }
         Page page = new Page(pageNum, pageSize);
         //count查询
