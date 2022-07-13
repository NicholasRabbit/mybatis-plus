### 1，MyBatisPlus设置主键算法为自动递增

```java
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键，套装id")
    private Integer id;
```

数据库改为int类型，并设置autoincrement，如果原来就是increment，则需要取消保存下，再设置保存下。