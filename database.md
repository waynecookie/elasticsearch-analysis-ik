database: test
table: es_lexicon
```
-- auto-generated definition
create table es_lexicon
(
    lexicon_id     bigint auto_increment comment '词库id'
        primary key,
    lexicon_text   varchar(20)                        not null comment '词条关键词',
    lexicon_type   int      default 0                 not null comment '0扩展词库 1停用词库',
    lexicon_status int      default 0                 not null comment '词条状态 0正常 1暂停使用',
    del_flag       int      default 0                 not null comment '作废标志 0正常 1作废',
    create_time    datetime default CURRENT_TIMESTAMP not null comment '创建时间'
)
    comment 'ES远程扩展词库表' collate = utf8mb4_general_ci;
```