### 1，MyBatisPlus设置主键算法为自动递增

```java
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键，套装id")
    private Integer id;
```

数据库改为int类型，并设置autoincrement，如果原来就是increment，则需要取消保存下，再设置保存下。

### 2，@TableFiled使用注意事项

```JAVA
@ApiModelProperty(value = "经度")
@TableField(exist = false)  //这里的属性是 exist，不是value,值是boolean类型的
private String longitude;   //如果写成 value = "false" 则会把false当作数据库表的字段进行怎删改，导致报错
```

