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
/*
CREATE DATABASE [Arquitectos]

GO
Use Arquitectos
GO

create Table [Empleado]
(
[Id] Integer Not Null IDENTITY(1,1) PRIMARY KEY,
[Nomina] varchar (100) not null,
[Telefono] varchar(100) null,
[Nombre] varchar(100) null,
[Correo] varchar(100) null,
[IsBoss] bit,
[IdProyecto] integer null,

)
GO

Create Table [Usuario](
[Id] Integer Not Null IDENTITY(1,1) PRIMARY KEY,
[Usuario] varchar(100) not null,
[Contraseña] varchar(100) not null,
[IdEmpleado] integer UNIQUE FOREIGN KEY REFERENCES Empleado(Id),

)
GO

Create Table [Cliente]
(
[Id] Integer Not Null IDENTITY(1,1) PRIMARY KEY,
[Nombre] varchar (100)not null,
[Telefono] varchar(100) null,
[IsPerson] bit,
[Correo] varchar(100) null,
[TieneAporte] bit,
[Aporte] money,
)
GO

create table[TipoProyecto]
([Id] Integer Not Null IDENTITY(1,1) PRIMARY KEY,
[nombre] Char (30) NULL,
)
GO

Create table [Proyecto]
(
[Id]Integer Not Null IDENTITY(1,1) PRIMARY KEY,
[nombre] Char (30) NULL,
[IsPresupuesto] bit,
[presup] Money NULL,
[residen] Char (100) NULL,
[Tipo] integer not null,
[IdCliente] integer not null,
[IdJefe] integer not null,
foreign key (Tipo) REFERENCES TipoProyecto(Id),
foreign key (IdCliente) REFERENCES Cliente(Id),
foreign key (IdJefe) REFERENCES Empleado(Id)
) 
GO

ALTER TABLE [dbo].[Empleado]  WITH CHECK ADD FOREIGN KEY([IdProyecto])
REFERENCES [dbo].[Proyecto] ([Id])
GO

*/