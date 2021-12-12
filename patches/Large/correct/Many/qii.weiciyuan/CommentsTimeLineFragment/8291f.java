diff --git a/src/org/qii/weiciyuan/ui/maintimeline/CommentsTimeLineFragment.java b/src/org/qii/weiciyuan/ui/maintimeline/CommentsTimeLineFragment.java
index a5624aa..dd9ada1 100644
--- a/src/org/qii/weiciyuan/ui/maintimeline/CommentsTimeLineFragment.java
+++ b/src/org/qii/weiciyuan/ui/maintimeline/CommentsTimeLineFragment.java
@@ -241,7 +241,7 @@
     @Override
     protected CommentListBean getDoInBackgroundNewData() throws WeiboException {
         MainCommentsTimeLineDao dao = new MainCommentsTimeLineDao(((MainTimeLineActivity) getActivity()).getToken());
-        if (getList().getComments().size() > 0) {
+        if (getList() != null && getList().getComments().size() > 0) {
             dao.setSince_id(getList().getComments().get(0).getId());
         }
         CommentListBean result = dao.getGSONMsgList();
