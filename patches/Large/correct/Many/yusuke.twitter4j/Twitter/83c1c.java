diff --git a/src/main/java/twitter4j/Twitter.java b/src/main/java/twitter4j/Twitter.java
index f9d6b94..a40ce20 100644
--- a/src/main/java/twitter4j/Twitter.java
+++ b/src/main/java/twitter4j/Twitter.java
@@ -363,7 +363,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-Search-API-Method%3A-trends">Twitter Search API Method: trends</a>
      */
     public Trends getTrends() throws TwitterException {
-        return Trends.constructTrends(get(getSearchBaseURL() + "trends.json", false));
+        return Trends.createTrends(get(getSearchBaseURL() + "trends.json", false));
     }
 
     /**
@@ -375,7 +375,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-Search-API-Method%3A-trends">Twitter Search API Method: trends</a>
      */
     public Trends getCurrentTrends() throws TwitterException {
-        return Trends.constructTrendsList(get(getSearchBaseURL() + "trends/current.json"
+        return Trends.createTrendsList(get(getSearchBaseURL() + "trends/current.json"
                 , false)).get(0);
     }
 
@@ -389,7 +389,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-Search-API-Method%3A-trends">Twitter Search API Method: trends</a>
      */
     public Trends getCurrentTrends(boolean excludeHashTags) throws TwitterException {
-        return Trends.constructTrendsList(get(getSearchBaseURL() + "trends/current.json"
+        return Trends.createTrendsList(get(getSearchBaseURL() + "trends/current.json"
                 + (excludeHashTags ? "?exclude=hashtags" : ""), false)).get(0);
     }
 
@@ -403,7 +403,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-Search-API-Method%3A-trends-daily">Twitter Search API Method: trends daily</a>
      */
     public List<Trends> getDailyTrends() throws TwitterException {
-        return Trends.constructTrendsList(get(getSearchBaseURL() + "trends/daily.json", false));
+        return Trends.createTrendsList(get(getSearchBaseURL() + "trends/daily.json", false));
     }
 
     /**
@@ -417,7 +417,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-Search-API-Method%3A-trends-daily">Twitter Search API Method: trends daily</a>
      */
     public List<Trends> getDailyTrends(Date date, boolean excludeHashTags) throws TwitterException {
-        return Trends.constructTrendsList(get(getSearchBaseURL()
+        return Trends.createTrendsList(get(getSearchBaseURL()
                 + "trends/daily.json?date=" + toDateStr(date)
                 + (excludeHashTags ? "&exclude=hashtags" : ""), false));
     }
@@ -439,7 +439,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-Search-API-Method%3A-trends-weekly">Twitter Search API Method: trends weekly</a>
      */
     public List<Trends> getWeeklyTrends() throws TwitterException {
-        return Trends.constructTrendsList(get(getSearchBaseURL()
+        return Trends.createTrendsList(get(getSearchBaseURL()
                 + "trends/weekly.json", false));
     }
 
@@ -454,7 +454,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-Search-API-Method%3A-trends-weekly">Twitter Search API Method: trends weekly</a>
      */
     public List<Trends> getWeeklyTrends(Date date, boolean excludeHashTags) throws TwitterException {
-        return Trends.constructTrendsList(get(getSearchBaseURL()
+        return Trends.createTrendsList(get(getSearchBaseURL()
                 + "trends/weekly.json?date=" + toDateStr(date)
                 + (excludeHashTags ? "&exclude=hashtags" : ""), false));
     }
@@ -471,7 +471,7 @@
      */
     public ResponseList<Status> getPublicTimeline() throws
             TwitterException {
-        return Status.constructStatuses(get(getBaseURL() +
+        return Status.createStatuseList(get(getBaseURL() +
                 "statuses/public_timeline.json", false));
     }
 
@@ -486,7 +486,7 @@
      */
     public ResponseList<Status> getPublicTimeline(long sinceID) throws
             TwitterException {
-        return Status.constructStatuses(get(getBaseURL() +
+        return Status.createStatuseList(get(getBaseURL() +
                 "statuses/public_timeline.json", null, new Paging((long) sinceID).asPostParameterList(Paging.S)
                 , false));
     }
@@ -502,7 +502,7 @@
      */
     public ResponseList<Status> getHomeTimeline() throws
             TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/home_timeline.json", true));
+        return Status.createStatuseList(get(getBaseURL() + "statuses/home_timeline.json", true));
     }
 
 
@@ -518,7 +518,7 @@
      */
     public ResponseList<Status> getHomeTimeline(Paging paging) throws
             TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/home_timeline.json", null, paging.asPostParameterList(), true));
+        return Status.createStatuseList(get(getBaseURL() + "statuses/home_timeline.json", null, paging.asPostParameterList(), true));
     }
 
     /**
@@ -532,7 +532,7 @@
      */
     public ResponseList<Status> getFriendsTimeline() throws
             TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/friends_timeline.json", true));
+        return Status.createStatuseList(get(getBaseURL() + "statuses/friends_timeline.json", true));
     }
 
     /**
@@ -547,7 +547,7 @@
      */
     public ResponseList<Status> getFriendsTimeline(Paging paging) throws
             TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/friends_timeline.json",null, paging.asPostParameterList(), true));
+        return Status.createStatuseList(get(getBaseURL() + "statuses/friends_timeline.json",null, paging.asPostParameterList(), true));
     }
 
     /**
@@ -563,7 +563,7 @@
      */
     public ResponseList<Status> getUserTimeline(String id, Paging paging)
             throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/user_timeline/" + id + ".json",
+        return Status.createStatuseList(get(getBaseURL() + "statuses/user_timeline/" + id + ".json",
                 null, paging.asPostParameterList(), http.isAuthenticationEnabled()));
     }
 
@@ -577,7 +577,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-statuses-friends_timeline">Twitter API Wiki / Twitter REST API Method: statuses friends_timeline</a>
      */
     public ResponseList<Status> getUserTimeline(String id) throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/user_timeline/" + id + ".json", http.isAuthenticationEnabled()));
+        return Status.createStatuseList(get(getBaseURL() + "statuses/user_timeline/" + id + ".json", http.isAuthenticationEnabled()));
     }
 
     /**
@@ -590,7 +590,7 @@
      */
     public ResponseList<Status> getUserTimeline() throws
             TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/user_timeline.json"
+        return Status.createStatuseList(get(getBaseURL() + "statuses/user_timeline.json"
                 , true));
     }
 
@@ -606,7 +606,7 @@
      */
     public ResponseList<Status> getUserTimeline(Paging paging) throws
             TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/user_timeline.json"
+        return Status.createStatuseList(get(getBaseURL() + "statuses/user_timeline.json"
                 , null, paging.asPostParameterList(), true));
     }
 
@@ -620,7 +620,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-statuses-mentions">Twitter API Wiki / Twitter REST API Method: statuses mentions</a>
      */
     public ResponseList<Status> getMentions() throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/mentions.json",
+        return Status.createStatuseList(get(getBaseURL() + "statuses/mentions.json",
                 null, true));
     }
 
@@ -635,7 +635,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-statuses-mentions">Twitter API Wiki / Twitter REST API Method: statuses mentions</a>
      */
     public ResponseList<Status> getMentions(Paging paging) throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/mentions.json",
+        return Status.createStatuseList(get(getBaseURL() + "statuses/mentions.json",
                 null, paging.asPostParameterList(), true));
     }
 
@@ -649,7 +649,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-statuses-retweeted_by_me">Twitter API Wiki / Twitter REST API Method: statuses/retweeted_by_me</a>
      */
     public ResponseList<Status> getRetweetedByMe() throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/retweeted_by_me.json",
+        return Status.createStatuseList(get(getBaseURL() + "statuses/retweeted_by_me.json",
                 null, true));
     }
 
@@ -664,7 +664,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-statuses-retweeted_by_me">Twitter API Wiki / Twitter REST API Method: statuses/retweeted_by_me</a>
      */
     public ResponseList<Status> getRetweetedByMe(Paging paging) throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/retweeted_by_me.json",
+        return Status.createStatuseList(get(getBaseURL() + "statuses/retweeted_by_me.json",
                 null, paging.asPostParameterList(), true));
     }
 
@@ -678,7 +678,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-statuses-retweeted_to_me">Twitter API Wiki / Twitter REST API Method: statuses/retweeted_to_me</a>
      */
     public ResponseList<Status> getRetweetedToMe() throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/retweeted_to_me.json",
+        return Status.createStatuseList(get(getBaseURL() + "statuses/retweeted_to_me.json",
                 null, true));
     }
 
@@ -693,7 +693,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-statuses-retweeted_to_me">Twitter API Wiki / Twitter REST API Method: statuses/retweeted_to_me</a>
      */
     public ResponseList<Status> getRetweetedToMe(Paging paging) throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/retweeted_to_me.json",
+        return Status.createStatuseList(get(getBaseURL() + "statuses/retweeted_to_me.json",
                 null, paging.asPostParameterList(), true));
     }
 
@@ -707,7 +707,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-statuses-retweets_of_me">Twitter API Wiki / Twitter REST API Method: statuses/retweets_of_me</a>
      */
     public ResponseList<Status> getRetweetsOfMe() throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/retweets_of_me.json",
+        return Status.createStatuseList(get(getBaseURL() + "statuses/retweets_of_me.json",
                 null, true));
     }
 
@@ -722,7 +722,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-statuses-retweets_of_me">Twitter API Wiki / Twitter REST API Method: statuses/retweets_of_me</a>
      */
     public ResponseList<Status> getRetweetsOfMe(Paging paging) throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "statuses/retweets_of_me.json",
+        return Status.createStatuseList(get(getBaseURL() + "statuses/retweets_of_me.json",
                 null, paging.asPostParameterList(), true));
     }
 
@@ -860,7 +860,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-statuses-retweets">Twitter API Wiki / Twitter REST API Method: statuses retweets</a>
      */
     public ResponseList<Status> getRetweets(long statusId) throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL()
+        return Status.createStatuseList(get(getBaseURL()
                 + "statuses/retweets/" + statusId + ".json", true));
     }
 
@@ -1073,7 +1073,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-GET-lists">Twitter REST API Method: GET lists</a>
      */
     public PagableResponseList<twitter4j.List> getUserLists(String user, long cursor) throws TwitterException {
-        return twitter4j.List.constructListOfLists(get(getApiBaseURL() + V1 +
+        return twitter4j.List.createListList(get(getApiBaseURL() + V1 +
                 user + "/lists.json?cursor=" + cursor, true));
     }
 
@@ -1117,7 +1117,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-GET-list-statuses">Twitter REST API Method: GET list statuses</a>
      */
     public ResponseList<Status> getUserListStatuses(String user, int id, Paging paging) throws TwitterException {
-        return Status.constructStatuses(get(getApiBaseURL() + V1 + user +
+        return Status.createStatuseList(get(getApiBaseURL() + V1 + user +
                 "/lists/" + id + "/statuses.json", new PostParameter[0],
                 paging.asPostParameterList(Paging.SMCP, Paging.PER_PAGE), true));
     }
@@ -1132,7 +1132,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-GET-list-memberships">Twitter REST API Method: GET /:user/lists/memberships</a>
      */
     public PagableResponseList<twitter4j.List> getUserListMemberships(String user, long cursor) throws TwitterException {
-        return twitter4j.List.constructListOfLists(get(getApiBaseURL() + V1 +
+        return twitter4j.List.createListList(get(getApiBaseURL() + V1 +
                 user + "/lists/memberships.json?cursor=" + cursor, true));
     }
 
@@ -1146,7 +1146,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-GET-list-subscriptions">Twitter REST API Method: GET list subscriptions</a>
      */
     public PagableResponseList<twitter4j.List> getUserListSubscriptions(String user, long cursor) throws TwitterException {
-        return twitter4j.List.constructListOfLists(get(getApiBaseURL() + V1 +
+        return twitter4j.List.createListList(get(getApiBaseURL() + V1 +
                 user + "/lists/subscriptions.json?cursor=" + cursor, true));
     }
 
@@ -1160,7 +1160,7 @@
     * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-direct_messages">Twitter API Wiki / Twitter REST API Method: direct_messages</a>
     */
     public ResponseList<DirectMessage> getDirectMessages() throws TwitterException {
-        return DirectMessage.constructDirectMessages(get(getBaseURL() + "direct_messages.json", true));
+        return DirectMessage.createDirectMessageList(get(getBaseURL() + "direct_messages.json", true));
     }
 
     /**
@@ -1173,7 +1173,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-direct_messages">Twitter API Wiki / Twitter REST API Method: direct_messages</a>
      */
     public ResponseList<DirectMessage> getDirectMessages(Paging paging) throws TwitterException {
-        return DirectMessage.constructDirectMessages(get(getBaseURL()
+        return DirectMessage.createDirectMessageList(get(getBaseURL()
                 + "direct_messages.json", null, paging.asPostParameterList(), true));
     }
 
@@ -1187,7 +1187,7 @@
      */
     public ResponseList<DirectMessage> getSentDirectMessages() throws
             TwitterException {
-        return DirectMessage.constructDirectMessages(get(getBaseURL() +
+        return DirectMessage.createDirectMessageList(get(getBaseURL() +
                 "direct_messages/sent.json", new PostParameter[0], true));
     }
 
@@ -1203,7 +1203,7 @@
      */
     public ResponseList<DirectMessage> getSentDirectMessages(Paging paging) throws
             TwitterException {
-        return DirectMessage.constructDirectMessages(get(getBaseURL() +
+        return DirectMessage.createDirectMessageList(get(getBaseURL() +
                 "direct_messages/sent.json", new PostParameter[0],
                 paging.asPostParameterList(), true));
     }
@@ -1578,7 +1578,7 @@
      * @since Twitter4J 2.0.1
      */
     public ResponseList<Status> getFavorites() throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "favorites.json", new PostParameter[0], true));
+        return Status.createStatuseList(get(getBaseURL() + "favorites.json", new PostParameter[0], true));
     }
 
     /**
@@ -1591,7 +1591,7 @@
      * @since Twitter4J 2.0.1
      */
     public ResponseList<Status> getFavorites(int page) throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "favorites.json", "page", String.valueOf(page), true));
+        return Status.createStatuseList(get(getBaseURL() + "favorites.json", "page", String.valueOf(page), true));
     }
 
     /**
@@ -1604,7 +1604,7 @@
      * @since Twitter4J 2.0.1
      */
     public ResponseList<Status> getFavorites(String id) throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "favorites/" + id + ".json", new PostParameter[0], true));
+        return Status.createStatuseList(get(getBaseURL() + "favorites/" + id + ".json", new PostParameter[0], true));
     }
 
     /**
@@ -1618,7 +1618,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-favorites">Twitter API Wiki / Twitter REST API Method: favorites</a>
      */
     public ResponseList<Status> getFavorites(String id, int page) throws TwitterException {
-        return Status.constructStatuses(get(getBaseURL() + "favorites/" + id + ".json", "page", String.valueOf(page), true));
+        return Status.createStatuseList(get(getBaseURL() + "favorites/" + id + ".json", "page", String.valueOf(page), true));
     }
 
     /**
@@ -1774,7 +1774,7 @@
      * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method%3A-saved_searches">Twitter API Wiki / Twitter REST API Method: saved_searches</a>
      */
     public List<SavedSearch> getSavedSearches() throws TwitterException {
-        return SavedSearch.constructSavedSearches(get(getBaseURL() + "saved_searches.json", true));
+        return SavedSearch.createSavedSearchList(get(getBaseURL() + "saved_searches.json", true));
     }
 
     /**
