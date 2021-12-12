diff --git a/src/org/qii/weiciyuan/ui/userinfo/NewUserInfoFragment.java b/src/org/qii/weiciyuan/ui/userinfo/NewUserInfoFragment.java
index 408591a..ebc1279 100644
--- a/src/org/qii/weiciyuan/ui/userinfo/NewUserInfoFragment.java
+++ b/src/org/qii/weiciyuan/ui/userinfo/NewUserInfoFragment.java
@@ -878,7 +878,7 @@
         protected void onPostExecute(MyStatusTimeLineData result) {
             super.onPostExecute(result);
 
-            if (result != null) {
+            if (result != null && getActivity() != null) {
                 getListView().removeFooterView(progressFooter);
                 getList().addNewData(result.msgList);
                 getAdapter().notifyDataSetChanged();
