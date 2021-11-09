package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private int postTime;
    private String text;
    private String imageUrl;

    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private Donut donut;
    private Geo geo;
    private OptionsInfo optionsInfo;
    private RepostInfo repostInfo;
    private ViewsInfo viewsInfo;
}
