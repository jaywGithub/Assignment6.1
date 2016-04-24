package com.example.jayson.assignment6.factories.courierPackage;

import com.example.jayson.assignment6.domain.courierPackage.settings.PackageSizeType;
import com.example.jayson.assignment6.factories.courierPackage.settings.PackageSizeTypeFactory;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class Test_PackageSizeTypeFactory {
    @Test
    public void testCreate()throws Exception
    {
        PackageSizeType packageSizeType = PackageSizeTypeFactory.getPackageSizeType("smallBox");

        Assert.assertEquals("smallBox", packageSizeType.getName());
    }

    @Test
    public void testUpdate() throws Exception
    {
        PackageSizeType packageSizeType = PackageSizeTypeFactory.getPackageSizeType("smallBox");
        PackageSizeType newPackageSizeType = new PackageSizeType
                .Builder()
                .copy(packageSizeType )
                .name("mediumBox")
                .build();

        Assert.assertEquals("mediumBox", newPackageSizeType.getName());
    }
}
