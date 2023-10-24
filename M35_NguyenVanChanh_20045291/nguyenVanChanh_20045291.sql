USE [master]
GO
/****** Object:  Database [de2_231023]    Script Date: 5/6/2021 10:55:38 AM ******/
CREATE DATABASE [de2_231023]


USE [de2_231023]
GO
/****** Object:  Table [dbo].[san_pham]    Script Date: 5/6/2021 10:55:38 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[san_pham](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten_san_pham] [nvarchar](100) NULL,
	[don_gia] [float] NULL,
 CONSTRAINT [PK_san_pham] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) 

insert into san_pham values
(N'May tinh Casio', 600000),
(N'Balo', 250000),
(N'Ban hoc', 120000);

select * from san_pham

