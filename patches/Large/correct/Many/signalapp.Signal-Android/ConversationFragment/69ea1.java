diff --git a/src/org/thoughtcrime/securesms/ConversationFragment.java b/src/org/thoughtcrime/securesms/ConversationFragment.java
index 6361353..39d0486 100644
--- a/src/org/thoughtcrime/securesms/ConversationFragment.java
+++ b/src/org/thoughtcrime/securesms/ConversationFragment.java
@@ -399,7 +399,7 @@
     Intent composeIntent = new Intent(getActivity(), ShareActivity.class);
     composeIntent.putExtra(Intent.EXTRA_TEXT, message.getDisplayBody().toString());
     if (message.isMms()) {
-      MediaMmsMessageRecord mediaMessage = (MediaMmsMessageRecord) message;
+      MmsMessageRecord mediaMessage = (MmsMessageRecord) message;
       if (mediaMessage.containsMediaSlide()) {
         Slide slide = mediaMessage.getSlideDeck().getSlides().get(0);
         composeIntent.putExtra(Intent.EXTRA_STREAM, slide.getUri());
