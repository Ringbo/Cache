diff --git a/twitter4j-core/src/main/java/twitter4j/Twitter.java b/twitter4j-core/src/main/java/twitter4j/Twitter.java
index 069622c..a391273 100644
--- a/twitter4j-core/src/main/java/twitter4j/Twitter.java
+++ b/twitter4j-core/src/main/java/twitter4j/Twitter.java
@@ -237,21 +237,21 @@
      * {@inheritDoc}
      */
     public Trends getTrends() throws TwitterException {
-        return new TrendsJSONImpl(http.get(conf.getSearchBaseURL() + "trends.json"));
+        return new TrendsJSONImpl(http.get(conf.getRestBaseURL() + "trends.json"));
     }
 
     /**
      * {@inheritDoc}
      */
     public Trends getCurrentTrends() throws TwitterException {
-        return TrendsJSONImpl.createTrendsList(http.get(conf.getSearchBaseURL() + "trends/current.json")).get(0);
+        return TrendsJSONImpl.createTrendsList(http.get(conf.getRestBaseURL() + "trends/current.json")).get(0);
     }
 
     /**
      * {@inheritDoc}
      */
     public Trends getCurrentTrends(boolean excludeHashTags) throws TwitterException {
-        return TrendsJSONImpl.createTrendsList(http.get(conf.getSearchBaseURL() + "trends/current.json"
+        return TrendsJSONImpl.createTrendsList(http.get(conf.getRestBaseURL() + "trends/current.json"
                 + (excludeHashTags ? "?exclude=hashtags" : ""))).get(0);
     }
 
@@ -259,14 +259,14 @@
      * {@inheritDoc}
      */
     public List<Trends> getDailyTrends() throws TwitterException {
-        return TrendsJSONImpl.createTrendsList(http.get(conf.getSearchBaseURL() + "trends/daily.json"));
+        return TrendsJSONImpl.createTrendsList(http.get(conf.getRestBaseURL() + "trends/daily.json"));
     }
 
     /**
      * {@inheritDoc}
      */
     public List<Trends> getDailyTrends(Date date, boolean excludeHashTags) throws TwitterException {
-        return TrendsJSONImpl.createTrendsList(http.get(conf.getSearchBaseURL()
+        return TrendsJSONImpl.createTrendsList(http.get(conf.getRestBaseURL()
                 + "trends/daily.json?date=" + toDateStr(date)
                 + (excludeHashTags ? "&exclude=hashtags" : "")));
     }
@@ -283,7 +283,7 @@
      * {@inheritDoc}
      */
     public List<Trends> getWeeklyTrends() throws TwitterException {
-        return TrendsJSONImpl.createTrendsList(http.get(conf.getSearchBaseURL()
+        return TrendsJSONImpl.createTrendsList(http.get(conf.getRestBaseURL()
                 + "trends/weekly.json"));
     }
 
@@ -291,7 +291,7 @@
      * {@inheritDoc}
      */
     public List<Trends> getWeeklyTrends(Date date, boolean excludeHashTags) throws TwitterException {
-        return TrendsJSONImpl.createTrendsList(http.get(conf.getSearchBaseURL()
+        return TrendsJSONImpl.createTrendsList(http.get(conf.getRestBaseURL()
                 + "trends/weekly.json?date=" + toDateStr(date)
                 + (excludeHashTags ? "&exclude=hashtags" : "")));
     }
