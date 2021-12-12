diff --git a/designernews/src/main/java/io/plaidapp/ui/designernews/story/DesignerNewsStory.java b/designernews/src/main/java/io/plaidapp/ui/designernews/story/DesignerNewsStory.java
index a118932..529f8ed 100644
--- a/designernews/src/main/java/io/plaidapp/ui/designernews/story/DesignerNewsStory.java
+++ b/designernews/src/main/java/io/plaidapp/ui/designernews/story/DesignerNewsStory.java
@@ -137,7 +137,7 @@
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_designer_news_story);
 
-        commentsRepository = Injection.provideDesignerNewsCommentsRepository();
+        commentsRepository = Injection.provideDesignerNewsCommentsRepository(this);
         bindResources();
 
         story = getIntent().getParcelableExtra(Activities.DesignerNews.Story.EXTRA_STORY);
