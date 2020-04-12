package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.constants.Gender;
import com.semanticsquare.thrillio.constants.UserType;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;
import com.semanticsquare.thrillio.managers.UserManager;

public class DataStore {

	private static final int USER_BOOKMARK_LIMIT = 5;
	private static final int BOOKMARK_COUNT_PER_TYPE = 5;
	private static final int BOOKMARKS_TYPES_COUNT = 3;
	private static final int TOTAL_USER_COUNT = 5;
	private static User[] users = new User[TOTAL_USER_COUNT];
	private static Bookmark[][] bookmarks = new Bookmark[BOOKMARKS_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
	private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT*USER_BOOKMARK_LIMIT];

public static void loadData() {
	LoadUsers();
}

private static void loadUsers() {
	users[0] = UserManager.getInstance().createUser(1000, "user0@semanticsquare.com", "test", "John", "M", Gender.MALE, UserType.USER);
}
}