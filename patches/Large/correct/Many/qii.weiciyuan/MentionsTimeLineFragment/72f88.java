diff --git a/src/org/qii/weiciyuan/ui/timeline/MentionsTimeLineFragment.java b/src/org/qii/weiciyuan/ui/timeline/MentionsTimeLineFragment.java
index 38ebd49..d7d1795 100644
--- a/src/org/qii/weiciyuan/ui/timeline/MentionsTimeLineFragment.java
+++ b/src/org/qii/weiciyuan/ui/timeline/MentionsTimeLineFragment.java
@@ -38,7 +38,7 @@
     @Override
     public void onActivityCreated(Bundle savedInstanceState) {
         super.onActivityCreated(savedInstanceState);
-        ((MainTimeLineActivity) getActivity()).setHomeListView(listView);
+        ((MainTimeLineActivity) getActivity()).setMentionsListView(listView);
         if (savedInstanceState != null) {
             bean = (MessageListBean) savedInstanceState.getSerializable("bean");
             timeLineAdapter.notifyDataSetChanged();
