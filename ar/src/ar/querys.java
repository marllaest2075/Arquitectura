/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar;

/**
 *
 * @author Cielo
 */
public class querys {
    
}
/*CREATE DATABASE [Arquitectos]

GO
Create table [Cliente]
(
[ID] Integer NOT NULL,
[nombre] Char (30) NULL,
[tel] Char (20) NULL,
[APF] Money NULL,
Primary Key ([ID])
)


Create table [persona]
(
[ID] Integer NOT NULL,
Primary Key ([ID])
) 


Create table [empresa]
(
[tipo] Char (20) NULL,
[correo] Char (30) NULL,
[ID] Integer NOT NULL,
Primary Key ([ID])
)


Create table [proyecto]
(
[CodA] Integer NOT NULL,
[nombre] Char (30) NULL,
[presup] Money NULL,
[residen] Char (10) NULL,
[comer] Char (10) NULL,
[instit] Char (10) NULL,
[public] Char (10) NULL,
[indus] Char (10) NULL,
Primary Key ([CodA])
) 


Create table [solicita]
(
[ID] Integer NOT NULL,
[CodA] Integer NOT NULL,
Primary Key ([ID], [CodA])
) 


Create table [empleados]
(
[IDe] Integer NOT NULL,
[CodA] Integer NOT NULL,
[nomina] Integer NULL,
[correo] Char (30) NULL,
[tel] Char (20) NULL,
Primary Key ([IDe])
)

Create table [Jefe]
(
 [IDe] Integer NOT NULL,
 [proyReali] char (40) NULL,
Primary Key ([IDe])
)


ALTER TABLE [dbo].[empleados]  WITH CHECK ADD FOREIGN KEY([CodA])
REFERENCES [dbo].[proyecto] ([CodA])
GO
ALTER TABLE [dbo].[empresa]  WITH CHECK ADD FOREIGN KEY([ID])
REFERENCES [dbo].[Cliente] ([ID])
GO
ALTER TABLE [dbo].[Jefe]  WITH NOCHECK ADD  CONSTRAINT [FK_Jefe_empleados] FOREIGN KEY([IDe])
REFERENCES [dbo].[empleados] ([IDe])
GO
ALTER TABLE [dbo].[Jefe] CHECK CONSTRAINT [FK_Jefe_empleados]
GO
ALTER TABLE [dbo].[persona]  WITH CHECK ADD FOREIGN KEY([ID])
REFERENCES [dbo].[Cliente] ([ID])
GO
ALTER TABLE [dbo].[solicita]  WITH CHECK ADD FOREIGN KEY([CodA])
REFERENCES [dbo].[proyecto] ([CodA])
GO
ALTER TABLE [dbo].[solicita]  WITH CHECK ADD FOREIGN KEY([ID])
REFERENCES [dbo].[Cliente] ([ID])
GO
USE [master]
GO
ALTER DATABASE [Arquitectos] SET  READ_WRITE 
GO*/